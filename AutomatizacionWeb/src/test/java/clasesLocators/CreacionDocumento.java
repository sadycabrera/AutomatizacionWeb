package clasesLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreacionDocumento {
	
	private static ChromeDriver driver;
	
	public static void redireccion_a_la_vista_del_buscador_de_Google(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sady.cabrera\\Desktop\\CreacionDocument\\CreacionDocument\\drivers\\chromedriver.exe");
		   driver = new ChromeDriver();
		  //driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get(arg1);
		  System.out.println("Cargando..."+arg1);

	}
	public static void ir_al_menu_de_Google_Apps() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Ir al menú de..."+driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.className("gb_Pf")).click();//EL NOMBRE DE LA CLASE ES CAMBIANTE
		
	}

	public static void abrir_Drive() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.get("https://www.google.com/intl/es/drive/");
		//driver.get("https://accounts.google.com/signin/v2/identifier?service=wise&passive=true&continue=http%3A%2F%2Fdrive.google.com%2F%3Futm_source%3Des&utm_medium=button&utm_campaign=web&utm_content=gotodrive&usp=gtd&ltmpl=drive&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.linkText("Ir a Google Drive")).click();
		
		System.out.println("Abrir..."+driver.getTitle());

	}

	public static void acceder_a_la_cuenta_de_Google_con_usuario_y_la_clave(String correo, String clave) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("identifierId")).sendKeys(correo);
		driver.findElement(By.className("CwaK9")).click();//CLICK EN BOTON SIGUIENTE
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(clave);
		driver.findElement(By.className("CwaK9")).click();//CLICK EN BOTON SIGUIENTE
		
		System.out.println("Login..."+driver.getTitle());
		
		
		
	}
	public static void crear_un_documento() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Cargando..."+driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"drive_main_page\"]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div")).click();
		
		
		//ABRE DOCUMENTO WORD
		try {
			
			driver.findElement(By.xpath("//*[@id=\"nt:Drive\"]")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void nombrar_al_documento(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cargando..."+driver.getTitle());
		//Thread.sleep(000);
		
		try {
			//IR A ARCHIVO
			driver.findElement(By.id("docs-file-menu")).click();
			
			//CAMBIAR NOMBRE
			driver.findElement(By.xpath("//*[@id=\":6k\"]")).click();
			
			//ESCRIBIR NUEVO NOMBRE
			
			driver.findElement(By.xpath("//*[@id=\"docs-title-widget\"]/input")).sendKeys("Sady");

		} 
		catch (NoSuchElementException e) {
			System.out.println("No se encontró el elemento por lentitud en la carga de la página");
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		
		}

}
