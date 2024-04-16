class Example{

    private static Example ob;

    public static Example getExample(){
        if(ob==null){
            ob=new Example();
        }
        return ob;
    }

}