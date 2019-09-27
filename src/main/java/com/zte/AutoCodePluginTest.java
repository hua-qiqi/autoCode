package com.zte;


import java.util.List;

import com.zte.lyh.PluginManager;
import com.zte.lyh.PluginParamsConfig;
import com.zte.lyh.PluginService;
import com.zte.lyh.XMLParser;

public class AutoCodePluginTest{

	public static void main(String[] args)  {
		
		try {
			XMLParser xp=new XMLParser();
			List<PluginParamsConfig> pluginList =xp.getPluginList();
			PluginManager pluginManager = new PluginManager(pluginList);
			for(PluginParamsConfig plugin : pluginList) {
				PluginService pluginService = pluginManager.getInstance(plugin.getClassName());
				System.out.println("开始执行[" + plugin.getName() + "]插件...");
				// 调用插件
				pluginService.service(plugin);
				System.out.println("[" + plugin.getName() + "]插件执行完成");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
