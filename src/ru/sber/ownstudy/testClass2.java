package ru.sber.ownstudy;

public class  testClass2 {
    public void test(){
        /*
        public class mainClazz {
    
    private static ArrayList<testClass1> arrayPRO = new ArrayList<>();
    
    static String fileName = null;     
    @SuppressWarnings ("unchecked")
    public static void main(String[] args){
        
   
// Заполняем коллекцию
        System.out.println("before " + arrayPRO.size());
        testClass1 t1 = new testClass1();
        t1.setName(JOptionPane.showInputDialog(null, "input your name"));
        t1.setSurname(JOptionPane.showInputDialog(null, "input your surname"));
        arrayPRO.add(t1);
        for(testClass1 p: arrayPRO){
            System.out.println(p.getName() + "  " + p.getSurname());
        }
        System.out.println("after " + arrayPRO.size());
        
        //Экспортируем данные в файл (сериализуем)
        serData();
        
        // Считываем данные из файла (Десериализуем)
        deSerData(fileName);
        
    }

    private static void serData() {
         fileName = JOptionPane.showInputDialog("input file name");
        try {
            FileOutputStream fileOut      = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            fileOut.close();
            objOut.close();
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
            System.exit(1);
        } catch (IOException ex) {
            System.out.println("При записи файла возникла ошибка Ввода/Вывода");
            System.exit(2);
        }
    }
    

    private static Object deSerData(String file_name) {
        System.out.println("Результат метода deSerData:");
        Object returnObj = null;
        try {
            FileInputStream fileIn      = new FileInputStream(file_name);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            fileIn.close();
            objIn.close();
            returnObj = objIn.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("При чтении файла возникла ошибка FileNotFoundException");
        } catch (IOException ex) {
            System.out.println("При чтении файла возникла ошибка Ввода/Вывода");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException");
        }
        return returnObj;
    }
}
        */
    }
}