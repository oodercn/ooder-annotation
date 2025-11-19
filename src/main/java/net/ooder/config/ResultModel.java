package net.ooder.config;

import com.alibaba.fastjson.annotation.JSONField;
import net.ooder.common.JDSException;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ResultModel<T> implements Future<T> {

    public int requestStatus;

    protected String token;

    private T data = null;

    public Map<String, Object> ctx;

    public Msg msg = new Msg();

    @JSONField(serialize = false)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public T getData() {
        return data;
    }


    public void execute() {
        new Thread() {
            @Override
            public void run() {
                try {
                    ResultModel.this.get();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }.start();

    }

    public void setData(T data) {
        this.data = data;
    }

    public ResultModel() {
        this.requestStatus = 0;
    }


    public void addCtx(String name, Object value) {
        if (ctx == null) {
            ctx = new HashMap<>();
        }
        ctx.put(name, value);
    }

    public Map<String, Object> getCtx() {
        return ctx;
    }

    public void setCtx(Map<String, Object> ctx) {
        this.ctx = ctx;
    }

    public int getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(int requestStatus) {
        this.requestStatus = requestStatus;
    }

    public boolean cancel(boolean mayInterruptIfRunning) {

        return false;
    }

    @Override
    public T get() throws JDSException {

        return data;
    }

    public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {

        return data;
    }

    @JSONField(serialize = false)
    public boolean isCancelled() {

        return false;
    }

    public void setCancelled(Boolean cancelled) {

    }

    public void setDone() {

    }

    @JSONField(serialize = false)
    public boolean isDone() {
        return false;
    }


    public Msg getMsg() {
        return msg;
    }

    public void setMsg(Msg msg) {
        this.msg = msg;
    }

    public class Msg {
        String message;
        String errdes;
        String prompt;
        String confirm;
        String busy;
        String log;
        String alert;
        String msg;

        public Msg() {

        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getErrdes() {
            return errdes;
        }

        public void setErrdes(String errdes) {
            this.errdes = errdes;
        }

        public String getPrompt() {
            return prompt;
        }

        public void setPrompt(String prompt) {
            this.prompt = prompt;
        }

        public String getConfirm() {
            return confirm;
        }

        public void setConfirm(String confirm) {
            this.confirm = confirm;
        }

        public String getBusy() {
            return busy;
        }

        public void setBusy(String busy) {
            this.busy = busy;
        }

        public String getLog() {
            return log;
        }

        public void setLog(String log) {
            this.log = log;
        }

        public String getAlert() {
            return alert;
        }

        public void setAlert(String alert) {
            this.alert = alert;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

}
