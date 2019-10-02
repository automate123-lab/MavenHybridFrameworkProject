package snippet;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE log4j:configuration SYSTEM "log4j.dtd">
	<log4j:configuration xmlns:log4j="http://jakarta.apache.org/log4j/" debug="true">
	    <!-- Console Appender -->
	    <appender name="console" class="org.apache.log4j.ConsoleAppender">
	        <param name="Target" value="System.out" />
	        <layout class="org.apache.log4j.PatternLayout">
	            <param name="ConversionPattern" value="%-5p | %d{yyyy-MM-dd HH:mm:ss} | [%t] %C{2} (%F:%L) - %m%n" />
	        </layout>
	    </appender>
	    <!-- Info Log File Appender -->
	    <appender name="info-log" class="org.apache.log4j.FileAppender">
	        <param name="File" value="info.log" />
	        <layout class="org.apache.log4j.PatternLayout">
	            <param name="ConversionPattern" value="%-5p | %d{yyyy-MM-dd HH:mm:ss} | [%t] %C{2} (%F:%L) - %m%n" />
	        </layout>
	        <filter class="org.apache.log4j.varia.LevelRangeFilter">
	            <param name="LevelMin" value="debug" />
	            <param name="LevelMax" value="info" />
	            <param name="AcceptOnMatch" value="true" />
	        </filter>
	    </appender>
	    <!-- Error Log File Appender -->
	    <appender name="error-log" class="org.apache.log4j.FileAppender">
	        <param name="Append" value="false" />
	        <param name="File" value="error.log" />
	        <layout class="org.apache.log4j.PatternLayout">
	            <param name="ConversionPattern" value="%-5p | %d{yyyy-MM-dd HH:mm:ss} | [%t] %C{2} (%F:%L) - %m%n" />
	        </layout>
	        <filter class="org.apache.log4j.varia.LevelRangeFilter">
	            <param name="LevelMin" value="warn" />
	            <param name="LevelMax" value="fatal" />
	            <param name="AcceptOnMatch" value="true" />
	        </filter>
	    </appender>
	    <logger name="com.jcg.log4j.example">
	        <appender-ref ref="info-log" />
	        <appender-ref ref="error-log" />
	    </logger>
	    <root>
	        <level value="debug" />
	        <appender-ref ref="console" />
	    </root>
	</log4j:configuration>
}

