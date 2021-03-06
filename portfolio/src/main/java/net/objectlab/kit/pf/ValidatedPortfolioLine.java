package net.objectlab.kit.pf;

import java.math.BigDecimal;
import java.util.List;

public interface ValidatedPortfolioLine extends ExistingPortfolioLine {
    BigDecimal getAllocationWeight();

    boolean isValid();

    List<RuleIssue> getIssues();
}
