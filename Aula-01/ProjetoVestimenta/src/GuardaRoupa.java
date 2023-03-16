

import java.util.Scanner;

public class GuardaRoupa {
	private int numVest;
	private int numCalcas;
	private int numCam;
    private static Vestido[] vestidos;
    private static Camisa[] camisas;
    private static Calca[] calcas;

    public GuardaRoupa(int numVest, int numCalcas, int numCam) {
    	this.numVest = numVest;
    	this.numCalcas = numCalcas;
    	this.numCam = numCam;
        this.vestidos = new Vestido[numVest];
        this.camisas = new Camisa[numCam];
        this.calcas = new Calca[numCalcas];
    }

    public void guardar(Vestido vestido) {
        for (int i = 0; i < vestidos.length; i++) {
            if (vestidos[i] == null) {
                vestidos[i] = vestido;
                System.out.println("Vestido guardado com sucesso!");
            }
        }
        System.out.println("Não há espaço para guardar mais vestidos.");
    }

    public void guardar(Camisa camisa) {
        for (int i = 0; i < camisas.length; i++) {
            if (camisas[i] == null) {
                camisas[i] = camisa;
                System.out.println("Camisa guardada com sucesso!");
            }
        }
        System.out.println("Não há espaço para guardar mais camisas.");
    }

    public void guardar(Calca calca) {
        for (int i = 0; i < calcas.length; i++) {
            if (calcas[i] == null) {
                calcas[i] = calca;
                System.out.println("Calça guardada com sucesso!");
            }
        }
        System.out.println("Não há espaço para guardar mais calças.");
    }

    public void listar() {
        System.out.println("Vestidos: ");
        for (Vestido vestido : vestidos) {
            if (vestido != null) {
                System.out.println(vestido);
            }
        }

        System.out.println("Camisas: ");
        for (Camisa camisa : camisas) {
            if (camisa != null) {
                System.out.println(camisa);
            }
        }

        System.out.println("Calças: ");
        for (Calca calca : calcas) {
            if (calca != null) {
                System.out.println(calca);
            }
        }
    }

    public static void main(String[] args) {
    
    	
    	Scanner sc = new Scanner(System.in);
    	int numVest, numCalcas, numCam, op = 0;
    	int numero, vlng;
    	String tec, col, tp;
    	boolean longo;
    	System.out.println("Bem-vindo à Nárnia!");
    	System.out.println("Digite a quantidade máxima de vestidos: ");
    	numVest = sc.nextInt();
    	System.out.println("Digite a quantidade máxima de calças: ");
    	numCalcas = sc.nextInt();
    	System.out.println("Digite a quantidade máxima de camisas: ");
    	numCam = sc.nextInt();
    	GuardaRoupa gr = new GuardaRoupa(numVest, numCalcas, numCam);
    	while (op != 4)
    	{
    	System.out.println(" 1- Guardar Vestido\n 2- Guardar Calça\n 3- Guardar Camisa \n 4- Listar roupas\n 5- Sair");
    	System.out.print("Digite uma opção: ");
		op = sc.nextInt();
		switch (op) {
    
		case 1:
			if (numVest > 0)
			{
				System.out.println("Insira cor: ");
				col = sc.next();
				System.out.println("Insira tipo de tecido: ");
				tec = sc.next();
				System.out.println("O vestido é longo: 1-Sim/2-Não");
				vlng = sc.nextInt();
				if (vlng == 1)
				{
					longo = true;
				}
				else 
				{
					longo = false;
				}
				vestidos[numVest-1] = new Vestido(col, tec, longo);
				gr.guardar(vestidos[numVest-1]);
				numVest = numVest - 1;
			}
			else if (numVest <= 0)
			{
				System.out.println("Infelizmente não há espaço!\n");
			}
			break;
			
		case 2:
			if (numCalcas > 0)
			{
				System.out.println("Insira tipo de tecido: ");
				tec = sc.next();
				System.out.println("Insira o número: ");
				numero = sc.nextInt();
				System.out.println("Insira cor: ");
				col = sc.next();
				calcas[numCalcas-1] = new Calca(col, tec, numero);
				gr.guardar(calcas[numCalcas-1]);
				numCalcas = numCalcas - 1;
			}
			else if (numCalcas <= 0)
			{
				System.out.println("Infelizmente não há espaço!\n");
			}
			
			break;
			
		case 3:
			if (numCam > 0)
			{
				System.out.println("Insira cor: ");
				col = sc.next();
				System.out.println("Insira tecido da camisa: ");
				tec = sc.next();
				System.out.println("insira o tipo da Camisa");
				tp = sc.next();
				System.out.println("Insira o número: ");
				numero = sc.nextInt();
				camisas[numCam-1] = new Camisa(col, tec, tp, numero);
				gr.guardar(camisas[numCam-1]);
				numCam = numCam - 1;
			}
			else if (numCam <= 0)
			{
				System.out.println("Infelizmente não há espaço!\n");
			}
			
			break;
		
		case 4: 
			gr.listar();
			break;

		default:
			System.out.println("Comando não definido no menu! Por favor, confira novamente...\n");
			break;
			
       }
    
    }
    	sc.close();
  }
  }