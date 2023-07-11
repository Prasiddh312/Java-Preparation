//Let's see the example of the Comparable interface that sorts the list elements on the basis of age.

 class StudentComparable implements Comparable<StudentComparable>{

    int rollno;
    String name;
    int age;

    StudentComparable(int rollno, String name, int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public int compareTo(StudentComparable st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;

    }

}
