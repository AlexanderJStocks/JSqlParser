/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2021 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserKeywordsUtils {

    public final static CharsetEncoder CHARSET_ENCODER = StandardCharsets.US_ASCII.newEncoder();

    public final static int RESTRICTED_FUNCTION = 1;

    public final static int RESTRICTED_SCHEMA = 2;

    public final static int RESTRICTED_TABLE = 4;

    public final static int RESTRICTED_COLUMN = 8;

    public final static int RESTRICTED_EXPRESSION = 16;

    public final static int RESTRICTED_ALIAS = 32;

    public final static int RESTRICTED_SQL2016 = 64;

    public final static int RESTRICTED_JSQLPARSER = 128 | RESTRICTED_FUNCTION | RESTRICTED_SCHEMA | RESTRICTED_TABLE | RESTRICTED_COLUMN | RESTRICTED_EXPRESSION | RESTRICTED_ALIAS | RESTRICTED_SQL2016;

    // Classification follows http://www.h2database.com/html/advanced.html#keywords
    public final static Object[][] ALL_RESERVED_KEYWORDS = { // add keywords from the composite token definitions:
    { "ABSENT", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "ALL", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "AND", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "ANY", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "AS", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "BETWEEN", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "BOTH", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "CASEWHEN", RESTRICTED_ALIAS }, // add keywords from the composite token definitions:
    { "CHECK", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "CONNECT", RESTRICTED_ALIAS }, // add keywords from the composite token definitions:
    { "CONNECT_BY_ROOT", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "CONSTRAINT", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "CREATE", RESTRICTED_ALIAS }, // add keywords from the composite token definitions:
    { "CROSS", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "CURRENT", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "DISTINCT", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "DOUBLE", RESTRICTED_ALIAS }, // add keywords from the composite token definitions:
    { "ELSE", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "EXCEPT", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "EXISTS", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "FETCH", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "FINAL", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "FOR", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "FORCE", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "FOREIGN", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "FROM", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "FULL", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "GROUP", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "GROUPING", RESTRICTED_ALIAS }, // add keywords from the composite token definitions:
    { "QUALIFY", RESTRICTED_ALIAS }, // add keywords from the composite token definitions:
    { "HAVING", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "IF", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "IIF", RESTRICTED_ALIAS }, // add keywords from the composite token definitions:
    { "IGNORE", RESTRICTED_ALIAS }, // add keywords from the composite token definitions:
    { "ILIKE", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "IN", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "INNER", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "INTERSECT", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "INTERVAL", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "INTO", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "IS", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "JOIN", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "LATERAL", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "LEFT", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "LIKE", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "LIMIT", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "MINUS", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "NATURAL", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "NOCYCLE", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "NOT", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "NULL", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "OFFSET", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "ON", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "ONLY", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "OPTIMIZE", RESTRICTED_ALIAS }, // add keywords from the composite token definitions:
    { "OR", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "ORDER", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "OUTER", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "OUTPUT", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "OPTIMIZE ", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "PIVOT", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "PROCEDURE", RESTRICTED_ALIAS }, // add keywords from the composite token definitions:
    { "PUBLIC", RESTRICTED_ALIAS }, // add keywords from the composite token definitions:
    { "RECURSIVE", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "REGEXP", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "RETURNING", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "RIGHT", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "SEL", RESTRICTED_ALIAS }, // add keywords from the composite token definitions:
    { "SELECT", RESTRICTED_ALIAS }, // add keywords from the composite token definitions:
    { "SEMI", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "SET", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "SOME", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "START", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "TABLES", RESTRICTED_ALIAS }, // add keywords from the composite token definitions:
    { "TOP", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "TRAILING", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "UNBOUNDED", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "UNION", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "UNIQUE", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "UNPIVOT", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "USE", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "USING", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "SQL_CACHE", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "SQL_CALC_FOUND_ROWS", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "SQL_NO_CACHE", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "STRAIGHT_JOIN", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "VALUE", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "VALUES", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "VARYING", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "WHEN", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "WHERE", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "WINDOW", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "WITH", RESTRICTED_SQL2016 }, // add keywords from the composite token definitions:
    { "XOR", RESTRICTED_JSQLPARSER }, // add keywords from the composite token definitions:
    { "XMLSERIALIZE", RESTRICTED_JSQLPARSER }, // tk=<K_DATE_LITERAL> | tk=<K_DATETIMELITERAL> | tk=<K_STRING_FUNCTION_NAME>
    // we will use the composite tokens instead, which are always hit first before the
    // simple keywords
    // @todo: figure out a way to remove these composite tokens, as they do more harm than
    // good
    // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "SEL", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "SELECT", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "DATE", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "TIME", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "TIMESTAMP", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "YEAR", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "MONTH", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "DAY", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "HOUR", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "MINUTE", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "SECOND", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "SUBSTR", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "SUBSTRING", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "TRIM", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "POSITION", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "OVERLAY", RESTRICTED_JSQLPARSER }, // @todo: Object Names should not start with Hex-Prefix, we shall not find that Token
    { "NEXTVAL", RESTRICTED_JSQLPARSER }, { "0x", RESTRICTED_JSQLPARSER } };

    @SuppressWarnings({ "PMD.ExcessiveMethodLength" })
    public static List<String> getReservedKeywords(int restriction) {
        ArrayList<String> keywords = new ArrayList<>();
        for (Object[] data : ALL_RESERVED_KEYWORDS) {
            int value = (int) data[1];
            // test if bit is not set
            if ((value & restriction) == restriction || (restriction & value) == value) {
                keywords.add((String) data[0]);
            }
        }
        return keywords;
    }

    /**
     * @param args with: Grammar File, Keyword Documentation File
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            throw new IllegalArgumentException("No filename provided as parameters ARGS[0]");
        }
        File grammarFile = new File(args[0]);
        if (grammarFile.exists() && grammarFile.canRead() && grammarFile.canWrite()) {
            buildGrammarForRelObjectName(grammarFile);
            buildGrammarForRelObjectNameWithoutValue(grammarFile);
        } else {
            throw new FileNotFoundException("Can't read file " + args[0]);
        }
        File keywordDocumentationFile = new File(args[1]);
        keywordDocumentationFile.createNewFile();
        if (keywordDocumentationFile.canWrite()) {
            writeKeywordsDocumentationFile(keywordDocumentationFile);
        } else {
            throw new FileNotFoundException("Can't read file " + args[1]);
        }
    }

    public static TreeSet<String> getAllKeywordsUsingRegex(File file) throws IOException {
        Pattern tokenBlockPattern = Pattern.compile("TOKEN\\s*:\\s*(?:/\\*.*\\*/*)\\n\\{(?:[^\\}\\{]+|\\{(?:[^\\}\\{]+|\\{[^\\}\\{]*\\})*\\})*\\}", Pattern.MULTILINE);
        Pattern tokenStringValuePattern = Pattern.compile("\\\"(\\w{2,})\\\"", Pattern.MULTILINE);
        TreeSet<String> allKeywords = new TreeSet<>();
        Path path = file.toPath();
        Charset charset = Charset.defaultCharset();
        String content = new String(Files.readAllBytes(path), charset);
        Matcher tokenBlockmatcher = tokenBlockPattern.matcher(content);
        while (tokenBlockmatcher.find()) {
            String tokenBlock = tokenBlockmatcher.group(0);
            Matcher tokenStringValueMatcher = tokenStringValuePattern.matcher(tokenBlock);
            while (tokenStringValueMatcher.find()) {
                String tokenValue = tokenStringValueMatcher.group(1);
                // test if pure US-ASCII
                if (CHARSET_ENCODER.canEncode(tokenValue) && tokenValue.matches("[A-Za-z]+")) {
                    allKeywords.add(tokenValue);
                }
            }
        }
        return allKeywords;
    }

    public static void buildGrammarForRelObjectNameWithoutValue(File file) throws Exception {
        Pattern methodBlockPattern = Pattern.compile("String\\W*RelObjectNameWithoutValue\\W*\\(\\W*\\)\\W*:\\s*\\{(?:[^}{]+|\\{(?:[^}{]+|\\{[^}{]*})*})*}\\s*\\{(?:[^}{]+|\\{(?:[^}{]+|\\{[^}{]*})*})*}", Pattern.MULTILINE);
        TreeSet<String> allKeywords = getAllKeywords(file);
        for (String reserved : getReservedKeywords(RESTRICTED_JSQLPARSER)) {
            allKeywords.remove(reserved);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(// @todo: find a way to avoid those hardcoded compound tokens
        "String RelObjectNameWithoutValue() :\n" + "{    Token tk = null; }\n" + "{\n" + "    ( tk=<S_IDENTIFIER> | tk=<S_QUOTED_IDENTIFIER> |  tk=<K_DATE_LITERAL> | tk=<K_DATETIMELITERAL> | tk=<K_STRING_FUNCTION_NAME> | tk=<K_ISOLATION> | tk=<K_TIME_KEY_EXPR> \n" + "      ");
        for (String keyword : allKeywords) {
            builder.append(" | tk=\"").append(keyword).append("\"");
        }
        builder.append(" )\n" + "    { return tk.image; }\n" + "}");
        replaceInFile(file, methodBlockPattern, builder.toString());
    }

    public static void buildGrammarForRelObjectName(File file) throws Exception {
        // Pattern pattern =
        // Pattern.compile("String\\W*RelObjectName\\W*\\(\\W*\\)\\W*:\\s*\\{(?:[^}{]+|\\{(?:[^}{]+|\\{[^}{]*})*})*}\\s*\\{(?:[^}{]+|\\{(?:[^}{]+|\\{[^}{]*})*})*}",
        // Pattern.MULTILINE);
        TreeSet<String> allKeywords = new TreeSet<>();
        for (String reserved : getReservedKeywords(RESTRICTED_ALIAS)) {
            allKeywords.add(reserved);
        }
        for (String reserved : getReservedKeywords(RESTRICTED_JSQLPARSER & ~RESTRICTED_ALIAS)) {
            allKeywords.remove(reserved);
        }
        StringBuilder builder = new StringBuilder();
        builder.append("String RelObjectName() :\n" + "{    Token tk = null; String result = null; }\n" + "{\n" + "    (result = RelObjectNameWithoutValue()\n" + "      ");
        for (String keyword : allKeywords) {
            builder.append(" | tk=\"").append(keyword).append("\"");
        }
        builder.append(" )\n" + "    { return tk!=null ? tk.image : result; }\n" + "}");
        // @todo: Needs fine-tuning, we are not replacing this part yet
        // replaceInFile(file, pattern, builder.toString());
    }

    public static TreeSet<String> getAllKeywords(File file) throws Exception {
        return getAllKeywordsUsingRegex(file);
    }

    private static void replaceInFile(File file, Pattern pattern, String replacement) throws IOException {
        Path path = file.toPath();
        Charset charset = Charset.defaultCharset();
        String content = new String(Files.readAllBytes(path), charset);
        content = pattern.matcher(content).replaceAll(replacement);
        Files.write(file.toPath(), content.getBytes(charset));
    }

    public static String rightPadding(String input, char ch, int length) {
        return String.format("%" + (-length) + "s", input).replace(' ', ch);
    }

    public static void writeKeywordsDocumentationFile(File file) throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append("***********************\n");
        builder.append("Restricted Keywords\n");
        builder.append("***********************\n");
        builder.append("\n");
        builder.append("The following Keywords are **restricted** in JSQLParser-|JSQLPARSER_VERSION| and must not be used for **Naming Objects**: \n");
        builder.append("\n");
        builder.append("+----------------------+-------------+-----------+\n");
        builder.append("| **Keyword**          | JSQL Parser | SQL:2016  |\n");
        builder.append("+----------------------+-------------+-----------+\n");
        for (Object[] keywordDefinition : ALL_RESERVED_KEYWORDS) {
            builder.append("| ").append(rightPadding(keywordDefinition[0].toString(), ' ', 20)).append(" | ");
            int value = (int) keywordDefinition[1];
            int restriction = RESTRICTED_JSQLPARSER;
            String s = (value & restriction) == restriction || (restriction & value) == value ? "Yes" : "";
            builder.append(rightPadding(s, ' ', 11)).append(" | ");
            restriction = RESTRICTED_SQL2016;
            s = (value & restriction) == restriction || (restriction & value) == value ? "Yes" : "";
            builder.append(rightPadding(s, ' ', 9)).append(" | ");
            builder.append("\n");
            builder.append("+----------------------+-------------+-----------+\n");
        }
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.append(builder);
            fileWriter.flush();
        }
    }
}
