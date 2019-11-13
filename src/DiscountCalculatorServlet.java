import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculatorServlet", urlPatterns = "/calculate")
public class DiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");
        float price = Float.parseFloat(request.getParameter("price"));
        float discountRate = Float.parseFloat(request.getParameter("discountRate"));
        double discountAmount = price * discountRate * 0.01;
        double discountedPrice = price - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description: " + product + "</h1>");
        writer.println("<h1>Price: $" + price + "</h1>");
        writer.println("<h1>Discount Percent: " + discountRate + "%</h1>");
        writer.println("<h1>Discount Amount: $" + discountAmount + "</h1>");
        writer.println("<h1>Discount Price: $" + discountedPrice + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
