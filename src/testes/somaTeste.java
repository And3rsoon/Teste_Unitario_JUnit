package testes;
import exemplos.Main;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


//Testes usando JUnit 5
class somaTeste {

	public static Main mn;
	public int x,y;
	
	
	//Usamos esse metodo sempre quando precisamos fazer algo antes de iniciar os testes, execulta uma única vez
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		mn=new Main();
		
	}
     
	//Metodo usando para fazer algo após todos os testes serem concluídos
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Testes Finalizados");
		
	}
    //esse método é chamado uma vez antes da execução de cada teste, nesse exemplo ele irá gerar 2 números aleatórios, antes de cada teste
	@BeforeEach
	void setUp() throws Exception {
		this.x=(int)Math.random()*100;
		this.y=(int)Math.random()*100;
	}

	//esse método é chamado uma vez depois da execução de cada teste
	@AfterEach
	void tearDown() throws Exception {
	}

	//Aqui os testes são rodados
	//podemos realizar vários testes usando a anotação @RepeatedTest(numero de vezes)
	//@RepeatedTest(100) 
	@Test
	void test() {
		assertEquals(x+y,mn.soma(y, x));
	}

}
