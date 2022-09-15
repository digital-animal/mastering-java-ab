public class URLParser {
    public static void main(String[] args) {
        parseURL("http://www.google.com");
        parseURL("https://www.yahoo.com");
        parseURL("https://www.sob.gov");
        parseURL("http://www.wikipedia.org");
        parseURL("ftp://www.telnet.net");
        parseURL("smtp://www.email.com");
    }

    public static void parseURL(String url) {
        int i = url.indexOf(":");
        int j = url.lastIndexOf(".");
        int k = url.length();
        String protocol = url.substring(0, i);
        String domain = url.substring(j, k);

        System.out.println("# Name: "+url);
        System.out.print("# Protocol: ");

        if(protocol.equals("http"))
            System.out.println("Hyper Text Transfer Protocol");
        else if(protocol.equals("https"))
            System.out.println("Hyper Text Transfer Protocol Secured");
        else if(protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");
        else if(protocol.equals("smtp"))
            System.out.println("Simple Mail Transfer Protocol");
        /*
        System.out.print("# Type: ");
        if(domain.equals(".com"))
            System.out.println("Commercial Website");
        else if(domain.equals(".org"))
            System.out.println("Organization Website");
        else if(domain.equals(".gov"))
            System.out.println("Government Website");
        else if(domain.equals(".net"))
            System.out.println("Network Website");
        */
        
        System.out.print("# Type: ");
        switch(domain) {
            case ".com":
                System.out.println("Commercial Website");
                break;
            case ".org":
                System.out.println("Organization Website");
                break;
            case ".gov":
                System.out.println("Government Website");
                break;
            case ".net":
                System.out.println("Network Website");
                break;
            default:
                System.out.println("Invalid Domain Name");
                break;
        }

        System.out.println();
    }
}
