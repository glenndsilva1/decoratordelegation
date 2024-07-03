package decorator;

public abstract class TextDecorator implements Text {
    protected Text decoratedText;
public TextDecorator(Text decoratedText) {
        this.decoratedText = decoratedText;
    }
    public String getContent() {
        return decoratedText.getContent();
    }
}
