package s7;

import com.google.android.ads.mediationtestsuite.dataobjects.SingleFormatConfigurationItem;

/* compiled from: SingleFormatConfigurationItemViewModel.java */
/* loaded from: classes2.dex */
public abstract class n<T extends SingleFormatConfigurationItem> extends d<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n(T t10) {
        super(t10);
    }

    public String w() {
        return ((SingleFormatConfigurationItem) p()).n().getDisplayString();
    }

    public String x() {
        return ((SingleFormatConfigurationItem) p()).e();
    }
}
