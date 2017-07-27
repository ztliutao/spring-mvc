package com.main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * Hello world!
 *
 */
public class GeneratorMain {
	public static void main(String[] args)
			throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
		List<String> warnings = new ArrayList<String>();
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp
				.parseConfiguration(GeneratorMain.class.getClassLoader().getResourceAsStream("generatorConfig.xml"));
		DefaultShellCallback shellCallback = new DefaultShellCallback(true);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
		myBatisGenerator.generate(null);
		for (String string : warnings) {
			System.out.println(string);
		}
		System.out.println("sucess");
	}
}
