package org.example.helloworld;

import io.github.nixtabyte.telegram.jtelebot.server.impl.DefaultCommandDispatcher;
import io.github.nixtabyte.telegram.jtelebot.server.impl.DefaultCommandQueue;
import io.github.nixtabyte.telegram.jtelebot.server.impl.DefaultCommandWatcher;

public class Main {
	
	public static void main(String[] args) {
		DefaultCommandDispatcher commandDispatcher = new DefaultCommandDispatcher(10, 100, new DefaultCommandQueue());
		commandDispatcher.startUp();
		
		DefaultCommandWatcher commandWatcher = new DefaultCommandWatcher(2000, 100, "435079119:AAHVfLPzIve9eWlihRXXTqBB5-XgoTsHWKs", commandDispatcher, new HelloWorldCommandFactory());
		commandWatcher.startUp();
	}

}
