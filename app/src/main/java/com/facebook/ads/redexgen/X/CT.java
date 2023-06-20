package com.facebook.ads.redexgen.X;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.facebook.ads.redexgen.X.CN;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public interface CT<T extends CN> {
    void closeSession(byte[] bArr);

    T createMediaCrypto(byte[] bArr) throws MediaCryptoException;

    CO getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i10, HashMap<String, String> hashMap) throws NotProvisionedException;

    CS getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void restoreKeys(byte[] bArr, byte[] bArr2);
}
