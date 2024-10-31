public class Main {
    public static void main(String[] args) {
        
        Forma vet [ ] = new Forma[6];

        vet[0] = new Circulo(1);
        vet[1] = new Quadrado(2);
        vet[2] = new Triangulo(3, 4);
        vet[3] = new Esfera(5);
        vet[4] = new Cubo(3);
        vet[5] = new Tetraedro(2, 3);


        for(Forma aux : vet){
            if (aux instanceof FormaBidimencional){
                System.out.println(aux.toString() + "\nArea: "+ aux.obterArea());
            }
            else{
                System.out.println(aux.toString() + "\nVolume: "+ aux.obterVolume()); 
            }
        }


    }
    
}
