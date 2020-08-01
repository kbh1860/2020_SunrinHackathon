from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.ui import WebDriverWait

import pymysql

def insert(obj):
    conn = pymysql.connect(host='1.231.141.99', user='root', password='sunrinhackathon', db='sunrin', charset='utf8')
    try:
        with conn.cursor() as curs:
            sql = f"insert into test(name) values('{obj}')"
            curs.execute(sql)
        conn.commit()
    finally:
        conn.close()

driver=webdriver.Chrome('C:/Users/KBH/Desktop/python crawling/ChromeDriver/chromedriver.exe') ##웹드라이버 주소 변경행
driver.implicitly_wait(3)
driver.get('https://map.naver.com/v5/search/%EB%8F%84%EB%B4%89%EA%B5%AC%20%ED%95%99%EC%9B%90?c=14141621.6949250,4531467.8404105,14,0,0,0,dh') ##웹 주소 넣으면 된당
WebDriverWait(driver, 10).until(
                expected_conditions.invisibility_of_element(
                    (By.CLASS_NAME, "map_container fold")
                )
            )
html=driver.page_source
elem=driver.find_element_by_xpath("//*")
source_code = elem.get_attribute("outerHTML")
source=source_code[source_code.find("</button></result-panel-folding-button><router-outlet"):source_code.find("class=\"btn_location\"> 접속위치")]
index=-1
while True:
    index=source.find("search_title_text",index+1)
    end=source.find("</span",index+19)
    if(index==-1):
        break
    numindex=source.find("phone ng-star-inserted",index+1)
    numend=source.find("</span",numindex+24)
    sources = source[index+19:end]+source[numindex+24:numend]
    print(sources)
    insert(sources)

import pymysql
def insert(obj):
        conn = pymysql.connect(host='1.231.141.99', user='root', password='sunrinhackathon', db='sunrin',
                               charset='utf8')
        try:
            with conn.cursor() as curs:
                sql = f"insert into test(name) values('{obj}')"
                curs.execute(sql)
            conn.commit()
        finally:
            conn.close()