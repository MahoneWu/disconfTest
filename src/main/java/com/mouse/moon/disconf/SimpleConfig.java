package com.mouse.moon.disconf;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Mahone Wu on 2017/3/28.
 */
@Service
@Scope("singleton")
@DisconfFile(filename = "redis.properties")
public class SimpleConfig {

    // 代表连接地址
    private String host;

    // 代表连接port
    private String port;

    /**
     * 地址
     *
     * @return
     */
    @DisconfFileItem(name = "host", associateField = "host")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * 端口
     *
     * @return
     */
    @DisconfFileItem(name = "port", associateField = "port")
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }



}
