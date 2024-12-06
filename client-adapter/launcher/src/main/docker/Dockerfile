FROM planyun/osbase:v1

# install canal-adapter
COPY canal.adapter-*.tar.gz /tmp/

COPY app_adapter.sh /home/admin

RUN \
    mkdir -p /home/admin/canal-adapter && \
    tar -zxf /tmp/canal.adapter-*.tar.gz -C /home/admin/canal-adapter && \
    rm -r /tmp/canal.adapter-*.tar.gz && \
    chmod +x /home/admin/canal-adapter/bin/*

# 8081 exporter
EXPOSE 8081

WORKDIR /home/admin

CMD ["./app_adapter.sh"]

