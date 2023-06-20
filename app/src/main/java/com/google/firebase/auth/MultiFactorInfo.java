package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public abstract class MultiFactorInfo extends AbstractSafeParcelable {
    public abstract JSONObject toJson();
}
