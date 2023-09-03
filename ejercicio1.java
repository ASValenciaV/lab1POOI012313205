public class Main {
    public static void main(String[] args) {
        
        // ejericio 1-a
        if (6 < 6*5)
          System.out.print("Hello");
          System.out.print(" There");
        // Respuesta: Hello
        // There
        
        
        // ejercicio 1-b
        int x = 1, y = 2, z = 3;
        if (x > y)
        if (x > z)
        System.out.println("1111");
            else
        System.out.println("2222");
        // Respuesta: No imprime nada
        
        
        // ejercicio 1-c
        if (x < z)
        System.out.println("*");
        else if (x == z)
        System.out.println("&");
        else
        System.out.println("$");
        //Respuesta: No imprime nada
        
        
        // ejercicio 1-d
        if (x > y)
        System.out.println("####");
        else {
        System.out.println("&&&&");
        System.out.println("****");
        }
        //Respuesta: &&&&
        // ****
        
        
        //ejercicio 1-e 
        int al = 100;
        int a2 = 200;
        if (al > 100 && a2 <= 200)
        System.out.print(al + " " + a2 + " " + (al + a2));
        else
        System.out.print(al + " " + a2 + " " + (2 * al - a2));
        //Respuesta: 100 200 0
        
        
        //ejericio 1-f
        if (++x > y++ || x-- > 0)
         z++;
         else
         z--;
        System.out.println(x + "\n" + z);
        //Respuesta: 4

        
        //ejericio 1-g
        if (x < y) {
        System.out.println("####");
        System.out.println("****");
        } 
        else {
        System.out.println("&&&&");
        }
        //Respuesta: ####
        // ****
        
        
        //ejericio 1-h
        if ('x' > 'y' || 66 > (int)('A')) {
        System.out.println("#*#");
        }
        //Respuesta: #*#"
        
        
        //ejericio 1-i
        if (x < z) {
        System.out.println("*");
        } else if (x == z) {
        System.out.println("&");
        } else {
        System.out.println("$");
        }
        //Respuesta: *
    }
}
