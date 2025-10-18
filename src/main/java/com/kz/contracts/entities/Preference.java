package com.kz.contracts.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "preferences")
public class Preference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String riskTolerance; // e.g., LOW, MEDIUM, HIGH
    private String investmentPreference; // e.g., STOCKS, BONDS, REAL_ESTATE
    private String communicationChannel; // e.g., EMAIL, SMS, PUSH_NOTIFICATION
    private String financialTipFrequency; // e.g., DAILY, WEEKLY, MONTHLY

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRiskTolerance() {
        return riskTolerance;
    }

    public void setRiskTolerance(String riskTolerance) {
        this.riskTolerance = riskTolerance;
    }

    public String getInvestmentPreference() {
        return investmentPreference;
    }

    public void setInvestmentPreference(String investmentPreference) {
        this.investmentPreference = investmentPreference;
    }

    public String getCommunicationChannel() {
        return communicationChannel;
    }

    public void setCommunicationChannel(String communicationChannel) {
        this.communicationChannel = communicationChannel;
    }

    public String getFinancialTipFrequency() {
        return financialTipFrequency;
    }

    public void setFinancialTipFrequency(String financialTipFrequency) {
        this.financialTipFrequency = financialTipFrequency;
    }
}
