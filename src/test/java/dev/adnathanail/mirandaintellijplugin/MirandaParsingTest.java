package dev.adnathanail.mirandaintellijplugin;

import com.intellij.testFramework.ParsingTestCase;
import dev.adnathanail.mirandaintellijplugin.language.MirandaParserDefinition;

public class MirandaParsingTest extends ParsingTestCase {

  public MirandaParsingTest() {
    super("", "m", new MirandaParserDefinition());
  }

  public void testParsingTestData() {
    doTest(true);
  }

  /**
   * @return path to test data file directory relative to root of this module.
   */
  @Override
  protected String getTestDataPath() {
    return "src/test/testData";
  }

  @Override
  protected boolean skipSpaces() {
    return false;
  }

  @Override
  protected boolean includeRanges() {
    return true;
  }

}
