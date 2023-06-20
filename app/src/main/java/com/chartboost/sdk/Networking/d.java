package com.chartboost.sdk.Networking;

import com.chartboost.sdk.impl.o0;
import java.io.IOException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public class d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public HttpsURLConnection a(o0<?> o0Var) throws IOException {
        return (HttpsURLConnection) new URL(o0Var.f14230b).openConnection();
    }
}
