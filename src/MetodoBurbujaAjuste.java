public class MetodoBurbujaAjuste {

    public int [] sortBubbleAva(int [] arreglo){
        int n = arreglo.length;
        boolean intercambio = false;
        for(int i = 0; i < n;i++ ){
            intercambio = false;
            System.out.println("Pasada "+i);
            for(int j = 0; j < n-1-i ; j++){
                System.out.println( "j = "+j+j+" [j] "+arreglo[j]+" j+1= "+j+1+" [j+1]= "+arreglo[j+1]);
                if (arreglo[j]> arreglo[j+1]) {
                    System.out.println("Si hay cambio");
 
                }
                //Intercambio
                int aux = arreglo[j];
                arreglo[j] = arreglo[j+1];
                arreglo[j+1] = arreglo[j];
                arreglo[j+1]= aux;
                intercambio = true;
            }
            //Si no hubo un intercambio ya esta ordenado y no deberia preguntar mas 
            if (intercambio) {
                break;
                
            }
        }
        return arreglo;
    }
    public void PrintArreglo(int[] arreglo) {
        for(int num : arreglo){
            System.out.print(num + ",");
        }
    }
    
}
