package edu.pdx.cs410J.Room1;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class KataIT extends InvokeMainTestCase {

  @Test
  void div() {
    String [] args = {"20", "5", "/"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, args);
    assertThat(result.getTextWrittenToStandardError(), containsString(""));
  }

  @Test
  void add(){
    String [] args = {"4","2","+","3","-"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, args);
    assertThat(result.getTextWrittenToStandardError(), containsString(""));
  }


}
