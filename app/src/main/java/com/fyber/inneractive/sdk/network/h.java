package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class h {
    public InputStream a(InputStream inputStream, boolean z10) {
        InputStream bufferedInputStream;
        try {
            if (z10) {
                IAlog.a("HttpExecutorImpl: getInputStream found gzip encoding", new Object[0]);
                bufferedInputStream = new GZIPInputStream(inputStream);
            } else {
                IAlog.a("HttpExecutorImpl: getInputStream no gzip encoding", new Object[0]);
                bufferedInputStream = new BufferedInputStream(inputStream);
            }
            return bufferedInputStream;
        } catch (Exception unused) {
            return null;
        }
    }

    public j a(InputStream inputStream, int i10, String str, Map<String, List<String>> map, String str2) throws q0, b {
        try {
            j jVar = new j(inputStream, i10, str, map, str2);
            if (jVar.f17569a / 100 != 5) {
                return jVar;
            }
            throw new b(String.format("server returned error %d", Integer.valueOf(jVar.f17569a)));
        } catch (b e10) {
            IAlog.a("failed executing network request", e10, new Object[0]);
            throw new b(e10);
        } catch (Exception e11) {
            IAlog.a("failed reading network response", e11, new Object[0]);
            throw new q0(e11);
        }
    }
}
