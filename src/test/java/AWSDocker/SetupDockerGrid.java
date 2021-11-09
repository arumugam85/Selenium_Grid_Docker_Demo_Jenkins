package AWSDocker;

import java.io.IOException;

import org.testng.annotations.Test;

public class SetupDockerGrid {

	@Test(priority = 1)
	void start_Docker_Grid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd c/ start Start_DockerGrid.bat");
		Thread.sleep(50000);
	}

	@Test(priority = 2)
	void stop_Docker_Grid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd c/ start Stop_DockerGrid.bat");
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}

}
