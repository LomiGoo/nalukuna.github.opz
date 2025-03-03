import java.util.Arrays;

public class stuGrAnalyzer {
     
     public static void main(String[] args) {
          int scores[] = {13, 15, 9, 29, 25, 13, 34, 25, 27, 39, 10};
          int i = scores.length - 1;
          Arrays.sort(scores);
          String dis = Arrays.toString(scores);
          System.out.println("Student Exam Analyzer");
          System.out.println("-------------------------------");
          System.out.println("Sorted Scores : " + dis);
          
          System.out.println("Lowest score : " + scores[0]);
          System.out.println("Highest score : " + scores[i]);
          
          double sum = 0;
          for(double score : scores) {
               sum += score;
          }
          sum /= scores.length;
          System.out.println("Average score : " + (String.format("%.2f", sum)));
     }
}