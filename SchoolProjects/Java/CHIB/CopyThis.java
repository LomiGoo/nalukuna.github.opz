1. output : [5, 4, 3, 2, 1]

int[] arr = {1, 2, 3, 4, 5};
int temp = arr[0];
arr[arr.length - 1];
arr[arr.length - 1] = temp;

2. output : 10, 32, 54
int[] numbers = {10, 21, 32, 43, 54};
for(int num : numbers) {
     if(int num % 2 == 0) {
          System.out.print(num + " ");
     }
}

3. output : 20, 10
int[] arr = {5, 10, 15, 20};
for(int i = arr.length - 1; i >= 0; i -= 2) {
     System.out.print(arr[i] + " ");
}

4. output : sum : 40
int[] arr = {4, 8, 12, 16};
int sum = 0;
for(int num : arr) {
     sum += num;
}