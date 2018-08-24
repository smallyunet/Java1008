Servlet 转发 重定向

转发 服务器行为 request 会话有效

重定向 浏览器行为 response 请求有效

登录页面 -> action -> 判断登录servlet -> 失败 -> redirect -> 登录页面

登录页面 -> action -> 判断登录servlet -> 成功 -> forward -> 中转servlet -> redirect -> web-inf下的用户页面

