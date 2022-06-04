public class WebSiteCheck {
    public static void main(String[] args)
    {
        String url = "https//:www.google.com";
        String protocol = url.substring(0, url.indexOf('/'));
        String name = url.substring(url.lastIndexOf('.'));
        System.out.println("Protocol used:" + protocol);
        System.out.println("Extension used: " + name);
    }
}
