
package com.quxionglie.tsm.model;

import com.quxionglie.tsm.util.DateUtils;
import com.google.common.base.MoreObjects;

public class User {

    //columns START
    /* uid */
    private Integer uid;

    /* 登录用户名 */
    private String username;

    /* 密码 */
    private String password;

    /* 创建时间 */
    private java.util.Date ctime;

    /* 最后修改时间 */
    private java.util.Date lmd;

    //columns END

	public User(){
	}

	public User( Integer uid ){
		this.uid = uid;
	}

    public void setUid(Integer value) {
            this.uid = value;
    }

    public Integer getUid() {
            return this.uid;
    }
    public void setUsername(String value) {
            this.username = value;
    }

    public String getUsername() {
            return this.username;
    }
    public void setPassword(String value) {
            this.password = value;
    }

    public String getPassword() {
            return this.password;
    }
    public void setCtime(java.util.Date value) {
            this.ctime = value;
    }

    public java.util.Date getCtime() {
            return this.ctime;
    }
    public String getCtimeString() {
            return DateUtils.format(this.ctime);
    }
    public void setLmd(java.util.Date value) {
            this.lmd = value;
    }

    public java.util.Date getLmd() {
            return this.lmd;
    }
    public String getLmdString() {
            return DateUtils.format(this.lmd);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
        .add("uid", uid)
        .add("username", username)
        .add("password", password)
        .add("ctime", ctime)
        .add("lmd", lmd)
        .toString();
        }
}

