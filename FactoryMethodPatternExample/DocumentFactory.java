abstract class DocumentFactory {

    // Factory Method
    abstract Document createDocument();

    public void openDocument() {
        Document document = createDocument();
        document.open();
    }
}