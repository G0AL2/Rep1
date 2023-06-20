package com.google.android.play.core.assetpacks;

/* loaded from: classes3.dex */
public class a extends gb.q {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i10) {
        super(String.format("Asset Pack Download Error(%d): %s", Integer.valueOf(i10), ab.a.a(i10)));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
