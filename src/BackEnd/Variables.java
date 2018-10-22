package BackEnd;

import java.util.regex.Pattern;

public class Variables {
	//public static String dir = "C:\\Users\\fedem\\Escritorio\\Proyectos\\Taller-bot-ops\\Sockets\\cs\\HiloServer.java";
	//public static String dir = "C:\\Users\\fedem\\Escritorio\\Proyectos\\Taller-bot-ops";
	public static String dir = "C:\\Users\\fedem\\Escritorio\\Proyectos";
    //public static String dir = "C:\\Users\\fedem\\Escritorio\\Proyectos\\Complejidad Ciclomatica";
	public static String clases = "class ([\\w_\\d]+)";
	public static String funciones = "(?:static\\s+|public\\s+|final\\s+|private\\s+|protected\\s+|default\\s+){0,3}[\\w_\\[\\]]+\\s+(\\w+)\\s*\\([^\\)]*\\)\\s+(?:throws \\w+(?:\\s*,\\s*\\w)*)?\\s*(?://[^\\n]*)*\\s*\\{[^\\}]+";
	public static Pattern patcc = Pattern.compile(""
			+ "\\W(?:if|while|for|case|try)\\W"
			+ "|(?:\\|\\||\\&\\&)"
			+ "|(?!r)(?!e)(?!t)(?!u)(?!r)(?!n)(?! )[\\w\\<\\>\\+\\-\\=\\*\\\\\\&\\|\\(\\) ]+\\?[^:;]+:[^:;]+;");
}
