package uk.sky.kata.exampleProject.response;

/**
 * Simple response class that returns error messages if there is any or a message, this is good to use as a base as all responses need
 * to return errors or messages
 */

public class ResponseBase {

  private String errors;
  private String messages;

  public String getErrors() {
    return errors;
  }

  public void setErrors(String errors) {
    this.errors = errors;
  }

  public String getMessages() {
    return messages;
  }

  public void setMessages(String messages) {
    this.messages = messages;
  }

  @Override
  public String toString() {
    return
        "errors='" + errors + '\'' +
        ", messages='" + messages + '\'';
  }
}
