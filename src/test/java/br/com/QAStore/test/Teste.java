package br.com.QAStore.test;

import java.io.IOException;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.QAStore.base.BaseTeste;
import br.com.QAStore.pages.Login;


@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "massa.csv")

public class Teste extends BaseTeste {

	@Test
	public void testeCupomFreteGratis(@Param(name = "email") String email,@Param(name = "senha") String senha, 
			@Param(name = "cupom") String cupom) throws InterruptedException, IOException{
		login(email,senha);
		
	}

	public void testeCupom10off(){
		
	}


	public void testeCupomVencido(){
	
	}
	
	public void login(String email, String senha) throws InterruptedException, IOException  {
		Login l = new Login(driver, properties.getProperty("url.qastore.login"), email, senha);
		l.login();
		Thread.sleep(2000);
	}
}
