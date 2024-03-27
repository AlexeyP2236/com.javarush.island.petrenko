package island;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class myThread extends Thread {
ExecutorService executorService = Executors.newFixedThreadPool(2);

Island island = new Island();


}
