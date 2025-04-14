class obj_print{
    int a=10;
    static int b=20;
    public static void main(String[] args) {
        obj_print obj=new obj_print();
        System.out.println(obj);
        // classname@HEXCODE eg obj_print@24b1d79b

        System.out.println(obj.a);
        System.out.println(obj_print.b);

    }
}
 
