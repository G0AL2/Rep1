package com.google.android.ads.mediationtestsuite.dataobjects;

import com.google.android.ads.mediationtestsuite.utils.b;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class YieldGroup extends SingleFormatConfigurationItem implements Matchable {

    /* renamed from: id  reason: collision with root package name */
    private Integer f20828id;

    public YieldGroup(Integer num, AdFormat adFormat, List<NetworkResponse> list) {
        super(adFormat, list);
        this.f20828id = num;
        for (AdFormat adFormat2 : SingleFormatConfigurationItem.o(adFormat)) {
            this.configsPerFormat.get(adFormat2).add(new NetworkConfig(adFormat2, new NetworkResponse(null, AdUnit.GOOGLE_ADAPTER_CLASS, false)));
        }
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem
    public String b(NetworkConfig networkConfig) {
        return b.c(networkConfig.i().g());
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.Matchable
    public boolean c(CharSequence charSequence) {
        String lowerCase = charSequence.toString().toLowerCase(Locale.getDefault());
        if (this.format.getDisplayString().toLowerCase(Locale.getDefault()).startsWith(lowerCase) || e().toLowerCase(Locale.getDefault()).contains(lowerCase)) {
            return true;
        }
        for (NetworkConfig networkConfig : h()) {
            if (networkConfig.c(lowerCase)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem
    public String e() {
        return this.f20828id.toString();
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem
    public String g() {
        return null;
    }
}
