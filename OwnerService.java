package com.packt.cardatabase;

public interface OwnerService {
    String getOwnerDetails();
}
class HumanOwner implements OwnerService {
    @Override
    public String getOwnerDetails() {
        return "Owned by a person with a valid license.";
    }
}