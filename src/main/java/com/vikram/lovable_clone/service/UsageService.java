package com.vikram.lovable_clone.service;
import com.vikram.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.vikram.lovable_clone.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
     UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
