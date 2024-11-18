import http.server
import ssl

# Create an HTTP server instance
server_address = ('0.0.0.0', 8443)
httpd = http.server.HTTPServer(server_address, http.server.SimpleHTTPRequestHandler)

# Create SSLContext and configure it
context = ssl.create_default_context(ssl.Purpose.CLIENT_AUTH)
context.load_cert_chain(certfile='/data/data/com.termux/files/home/.https/cert.pem', keyfile='/data/data/com.termux/files/home/.https/key.pem')

# Wrap the server socket with SSL
httpd.socket = context.wrap_socket(httpd.socket, server_side=True)

# Start the server
print("Starting HTTPS server on https://0.0.0.0:8443")
httpd.serve_forever()
