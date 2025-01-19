package homework31;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;


@Slf4j
public class PostOffice {

    private List<MailItem> mailItems;

    public List<MailItem> getMailItems() {
        return mailItems;
    }

    public PostOffice() {
        mailItems = new ArrayList<>();
        log.info("PostOffice is created. The initial mail items list is empty.");
    }

    public void addMailItem(MailItem item) {
        mailItems.add(item);
        log.info("Added mail item: {}", item);
    }

    public void calculateTotalShippingCost() {
        double totalCost = 0;
        for (MailItem item : mailItems) {
            totalCost += item.calculateShippingCost();
        }
        log.info("The total shipping cost is calculated: {} euro", totalCost);
        System.out.println("Total shipping cost: " + totalCost + " euro");
    }

    public void printAllDetails() {
        if (mailItems.isEmpty()) {
            log.warn("Mail items list is empty. There is no information to display.");
        } else {
            for (MailItem item : mailItems) {
                item.printDetails();
                System.out.println("---------------------");
            }
            log.info("Information about all mail items has been successfully displayed.");
        }
    }
}
