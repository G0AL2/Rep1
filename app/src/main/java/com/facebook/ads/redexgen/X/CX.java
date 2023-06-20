package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public interface CX {
    byte[] executeKeyRequest(UUID uuid, CO co, @Nullable String str) throws Exception;

    byte[] executeProvisionRequest(UUID uuid, CS cs) throws Exception;
}
