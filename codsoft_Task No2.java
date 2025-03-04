      /*  Input: Take marks obtained (out of 100) in each subject.
                Calculate Total Marks: Sum up the marks obtained in all subjects.
        Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
        average percentage.
        Grade Calculation: Assign grades based on the average percentage achieved.
        Display Results: Show the total marks, average percentage, and the corresponding grade to the user


        */


import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int marks;
float average;

        System.out.println("!  REPORT CARD  !");
        System.out.print("Marks in English :"  );
         int english =  sc.nextInt();
        System.out.print("Marks in Hindi :"  );
        int hindi  =  sc.nextInt();
        System.out.print("Marks in Maths :"  );
        int maths  =  sc.nextInt();
        System.out.print("arks in Urdu :"  );
        int urdu  =  sc.nextInt();
        System.out.print("arks in Sst :"  );
        int sst  =  sc.nextInt();

marks= english+hindi+maths+urdu+sst;
        average=(marks/5f);
        System.out.println("Total marks is :" +  marks);
        System.out.println("Average Percentage is :" +  average);

if(average>=90){
    System.out.println("Grade A");
}
else if(average>=80){
            System.out.println("Grade B");
        }
        else if(average>=50){
            System.out.println("Grade C");
        }
       else if(average>=25){
            System.out.println("Grade D");
        }
else {
    System.out.println("FAIL");
}


    }
}
