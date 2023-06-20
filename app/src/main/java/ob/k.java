package ob;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes3.dex */
public class k extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public k() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, Throwable th) {
        super(str, th);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
