import java.util.Scanner;

public class Main {
 
    public static void main(String args[])
    {
        Student[] arr;
        String unitName;
        Scanner sc = new Scanner(System.in);
 
        arr = new Student[25];
        
        System.out.println("Enter Unit name: ");
        unitName = sc.next();
        
        float highest=0, lowest=100, sum=0;
        double standardDeviation=0;
        for(int i = 0 ;i< 25; i++){
            float marks;
            
            System.out.println("Enter Student marks: ");
            
            do {
                marks = sc.nextInt();
                if (marks < 0 || marks > 100){
                   System.out.println("Please enter valid Student marks: "); 
                }
            } while(!(marks > 0 && marks <= 100));
            
            sum+=marks;
            
            
            if (marks > highest){
                highest = marks;
            }
            
            if(marks < lowest){
                lowest = marks;
            }
            
            arr[i] = new Student(marks);
        }
 
        System.out.print("*** Student data ***\n");
        
        System.out.printf("Unit Name: %s\n", unitName);
        System.out.println("Marks");
        for(int i =0;i<25;i ++){
            System.out.println(arr[i].marks);
        }
        
        System.out.print("************\n");
        
        System.out.println("Highest number is: " + highest);
        System.out.println("Lowest number is: " + lowest);
        
        float myNum = sum/25;
        for(int i =0;i<25;i ++){
            standardDeviation += Math.pow((arr[i].marks - myNum), 2);
        }
        
        standardDeviation = standardDeviation / 25;
        standardDeviation = Math.pow(standardDeviation, 0.5);
        
        System.out.println("Mean is: " + myNum);
        System.out.println("Standard deviation is: " + standardDeviation);
        
    }
}

class Student {
 
    public float marks;

    Student(float marks)
    {
        this.marks = marks;
    }
}