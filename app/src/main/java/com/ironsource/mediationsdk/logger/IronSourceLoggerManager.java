package com.ironsource.mediationsdk.logger;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class IronSourceLoggerManager extends IronSourceLogger implements LogListener {

    /* renamed from: c  reason: collision with root package name */
    private static IronSourceLoggerManager f27156c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<IronSourceLogger> f27157d;

    private IronSourceLoggerManager(String str) {
        super(str);
        ArrayList<IronSourceLogger> arrayList = new ArrayList<>();
        this.f27157d = arrayList;
        arrayList.add(new a(0));
    }

    public static synchronized IronSourceLoggerManager getLogger() {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            if (f27156c == null) {
                f27156c = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
            }
            ironSourceLoggerManager = f27156c;
        }
        return ironSourceLoggerManager;
    }

    public static synchronized IronSourceLoggerManager getLogger(int i10) {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            IronSourceLoggerManager ironSourceLoggerManager2 = f27156c;
            if (ironSourceLoggerManager2 == null) {
                f27156c = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
            } else {
                ironSourceLoggerManager2.f27152a = i10;
            }
            ironSourceLoggerManager = f27156c;
        }
        return ironSourceLoggerManager;
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f27157d.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public synchronized void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        if (i10 < this.f27152a) {
            return;
        }
        Iterator<IronSourceLogger> it = this.f27157d.iterator();
        while (it.hasNext()) {
            IronSourceLogger next = it.next();
            if (next.f27152a <= i10) {
                next.log(ironSourceTag, str, i10);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public synchronized void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th == null) {
            Iterator<IronSourceLogger> it = this.f27157d.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
            return;
        }
        Iterator<IronSourceLogger> it2 = this.f27157d.iterator();
        while (it2.hasNext()) {
            it2.next().logException(ironSourceTag, str, th);
        }
    }

    @Override // com.ironsource.mediationsdk.logger.LogListener
    public synchronized void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        log(ironSourceTag, str, i10);
    }

    public void setLoggerDebugLevel(String str, int i10) {
        if (str == null) {
            return;
        }
        IronSourceLogger ironSourceLogger = null;
        Iterator<IronSourceLogger> it = this.f27157d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IronSourceLogger next = it.next();
            if (next.f27153b.equals(str)) {
                ironSourceLogger = next;
                break;
            }
        }
        if (ironSourceLogger == null) {
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            log(ironSourceTag, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
        } else if (i10 < 0 || i10 > 3) {
            this.f27157d.remove(ironSourceLogger);
        } else {
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NATIVE;
            log(ironSourceTag2, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
            ironSourceLogger.setDebugLevel(i10);
        }
    }
}
