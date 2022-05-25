package uk.sky.kata.exampleProject.response;

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
