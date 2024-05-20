package com.example.springai.springaipromptengineering;

import org.junit.jupiter.api.Test;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;


@SpringBootTest
public class SummarizingPromptsTests extends BaseTestClass {

    String review1 = """
            "Elon Musk" by Walter Isaacson is an extraordinary biographical exploration of one of the most fascinating and innovative figures of our time. As an admirer of Elon Musk and his ventures, I found this book to be an incredibly insightful and inspiring read that goes far beyond the typical biography. Here's why I believe it's a must-read for anyone interested in technology, entrepreneurship, and the future of humanity.
                        
            Thorough and In-Depth Research:
            Walter Isaacson is renowned for his meticulous research and ability to provide a comprehensive account of his subjects. In "Elon Musk," he delves deep into Musk's life, from his childhood in South Africa to his founding of multiple groundbreaking companies like SpaceX and Tesla. The book leaves no stone unturned, offering a detailed and well-rounded portrait of this visionary entrepreneur.
                        
            Humanizing the Genius:
            Isaacson's writing shines in its ability to humanize Musk, a man often seen as an enigmatic genius. The book delves into Musk's personal struggles, his successes, and his vulnerabilities, allowing readers to relate to him on a human level. This approach makes the story all the more engaging and relatable.
                        
            Awe-Inspiring Vision:
            Musk's vision for the future is nothing short of awe-inspiring, and Isaacson does an exceptional job of conveying the magnitude of Musk's ambitions. From colonizing Mars to revolutionizing the automotive industry, Musk's visionary ideas are portrayed with enthusiasm and intellectual depth. Reading about his endeavors leaves you feeling invigorated and excited about the possibilities of our future.
                        
            Insights into the Creative Process:
            "Elon Musk" offers valuable insights into the creative process of a brilliant mind. The book details Musk's relentless pursuit of innovation and his willingness to take risks that others deemed impossible. For aspiring entrepreneurs and innovators, the book provides a treasure trove of lessons on perseverance, problem-solving, and thinking beyond conventional boundaries.
                        
            Compelling Narrative Style:
            Walter Isaacson's storytelling skills are evident throughout the book. His ability to craft a compelling narrative makes this biography read more like an adventure novel. The prose flows seamlessly, keeping the reader engaged and eager to turn the page.
                        
            Timely and Relevant:
            In an era where technology and the future of our planet are at the forefront of global discussions, "Elon Musk" is incredibly timely and relevant. The book not only provides a window into Musk's life but also addresses pressing issues like sustainable energy, space exploration, and artificial intelligence.
                        
            In conclusion, "Elon Musk" by Walter Isaacson is an exceptional biography that offers a profound and intimate look at the life and mind of a modern visionary. It's a testament to the power of human determination, innovation, and audacious dreams. Whether you're an Elon Musk enthusiast or simply curious about the world-changing ideas of our time, this book is a captivating and enlightening journey that is not to be missed. I highly recommend it as a must-read for anyone seeking inspiration and insight into the future.""";

    String reviewPrompt = """
        Your task is to generate a short summary for a book from an ecommerce site. The summary will be used for a
        web page selling the book.

        Summarize the review below, delimited by triple backticks, in at most 30 words.
    
        Review: ```{review}```
    """;


    @Test
    void testCreateDescriptionFromReview() {
        PromptTemplate promptTemplate = new PromptTemplate(reviewPrompt,
                Map.of("review", review1));

        System.out.println(openAiChatClient.call(promptTemplate.create()).getResult().getOutput().getContent());
    }

    String reviewKr = """
            "일론 머스크"는 Walter Isaacson이 저술한 뛰어난 전기적 탐구서로, 우리 시대에서 가장 매력적이고 혁신적인 인물 중 하나를 다루고 있습니다. 엘론 머스크와 그의 벤처에 찬사를 보내는 사람으로서 이 책은 전형적인 전기를 훨씬 넘어선, 믿을 수 없을 정도로 통찰력 있고 영감을 주는 읽을거리라고 생각합니다. 기술, 기업가 정신, 인류의 미래에 관심이 있는 사람이라면 꼭 읽어야 할 책이라고 믿는 이유는 다음과 같습니다.
                            
            철저하고 심도 있는 연구:
            Walter Isaacson은 꼼꼼한 연구와 주제에 대한 포괄적인 설명 능력으로 유명합니다. "엘론 머스크"에서 그는 남아프리카 공화국에서의 어린 시절부터 SpaceX와 Tesla 같은 획기적인 여러 회사를 설립한 머스크의 삶을 깊이 파고듭니다. 이 책은 어떤 것도 놓치지 않고, 이 비전적 기업가에 대한 자세하고 균형 잡힌 초상을 제공합니다.
                            
            천재를 인간적으로 묘사:
            Isaacson의 글은 종종 신비로운 천재로 여겨지는 머스크를 인간적으로 묘사하는 데 빛을 발합니다. 이 책은 머스크의 개인적인 고난, 성공, 그리고 취약점을 다루며 독자들이 그와 인간적으로 공감할 수 있도록 합니다. 이러한 접근 방식은 이야기를 더욱 매력적이고 공감 가게 만듭니다.
                            
            경외감을 불러일으키는 비전:
            머스크의 미래에 대한 비전은 경외심을 불러일으키기에 충분하며, Isaacson은 머스크의 야망의 규모를 탁월하게 전달합니다. 화성 식민지화부터 자동차 산업 혁신에 이르기까지, 머스크의 비전적인 아이디어들은 열정과 지적 깊이로 묘사됩니다. 그의 노력에 대해 읽으면 미래의 가능성에 대해 활기를 느끼고 흥분하게 됩니다.
                            
            창의적 과정에 대한 통찰:
            "일론 머스크"는 뛰어난 두뇌의 창의적 과정에 대한 귀중한 통찰을 제공합니다. 이 책은 머스크의 끊임없는 혁신 추구와 다른 사람들이 불가능하다고 생각한 위험을 감수하려는 의지를 자세히 설명합니다. 예비 기업가와 혁신가에게 이 책은 인내, 문제 해결, 그리고 전통적 경계를 넘어 생각하는 방법에 대한 귀중한 교훈을 제공합니다.
                            
            흥미로운 서술 방식:
            Walter Isaacson의 이야기 전개 능력은 책 전체에서 드러납니다. 그의 흥미진진한 서술 능력은 이 전기를 마치 모험 소설처럼 읽히게 만듭니다. 문장은 매끄럽게 흐르며 독자가 몰입하고 다음 페이지를 넘기게 만듭니다.
                            
            시의적절하고 관련성 있는 내용:
            기술과 지구의 미래가 글로벌 논의의 중심에 있는 시대에 "엘론 머스크"는 매우 시의적절하고 관련성이 있습니다. 이 책은 머스크의 삶을 조망할 뿐만 아니라 지속 가능한 에너지, 우주 탐사, 인공지능과 같은 긴급한 문제들도 다룹니다.
                            
            결론적으로, Walter Isaacson의 "일론 머스크"는 현대 비전가의 삶과 사고에 대해 깊고 친밀한 시각을 제공하는 뛰어난 전기입니다. 인간의 결단력, 혁신, 그리고 대담한 꿈의 힘을 증명하는 이 책은 일론 머스크를 좋아하는 사람이나 현대의 세계를 변화시키는 아이디어에 대해 호기심이 있는 사람 모두에게 매혹적이고 계몽적인 여정을 제공합니다. 영감과 미래에 대한 통찰을 찾는 모든 사람에게 강력히 추천하는 필독서입니다.""";
    String reviewPromptKr = """
        당신의 과제는 전자상거래 사이트의 책에 대한 짧은 요약을 생성하는 것입니다. 요약은 책을 판매하는 웹 페이지에 사용될 것입니다.
        아래에 삼중 백틱으로 구분된 리뷰를 20단어 이내로 요약하세요.
        Review: ```{review}```
    """;

    @Test
    void testCreateDescriptionFromReviewKr() {
        PromptTemplate promptTemplate = new PromptTemplate(reviewPromptKr,
                Map.of("review", reviewKr));

        System.out.println(openAiChatClient.call(promptTemplate.create()).getResult().getOutput().getContent());
    }



    String review2 = """
            I finally had the chance to read Walter Isaacson’s latest book on Elon Musk over the holidays. This book is more than just a biography; it offers a masterclass in the mindset and process of a tech revolutionary who challenges the status quo and redefines what's possible.
                         
            This engaging read delves into Musk's innovative work - from space exploration and sleek electric car designs to satellite internet and AI advancements. The narrative provides an insight into Musk's thought process, highlighting his strategic thinking, learn-by-trying approach, problem-solving skills, and bold decision-making.
                         
            Isaacson's approach is both educational and inspiring, simplifying the details of Musk's BIG-scale projects while maintaining the key elements of their groundbreaking impact. The book transforms his sequential innovation into a practical guide for the art of possibility exploration and idea development, accessible to readers from all walks of life.
                         
            The structure of the book, with short and readable chapters, enhances understanding and keeps you engaged. Isaacson’s thorough research and extensive interviews unlock the deeper significance of Musk's projects, beyond just technology. It enables readers to abstract the complexity of his work and extract valuable lessons applicable to business, the creative thought process, and even personal growth.
                         
            While the book is comprehensive, I wish it had delved deeper into Elon Musk's insights on AI. Given his pivotal roles in OpenAI and xAI GROK, readers would find the book even more valuable with a more extensive exploration of Musk's perspectives on AI.
            """;

    String review3 = """
            An excellent biography of an exceptional person. Elon Musk has been incredibly successful is diverse directions. This book gave insight into what has driven him. Like Steve Jobs, Musk is absolutely focused on the end product with minimal concern about the path. Musk is not satisfied when a product merely meets its initial specifications; it must also accomplish that by the most efficient means. And he doesn't fear taking risks along the way.
            It seems impossible that a single person could have accomplished what Musk has done. This book goes a long way to reveal how he came to be the way he is, how he operates and what drives him. It would be very hard to live with such a person and this seems fairly well documented. The purchase of Twitter/X is particularly interesting- his end goal was to end the 'woke' movement and encourage 'free speech', but things got complicated, and not helped by Musk's propensity to do stupid things (a recurring theme).
            The world is very lucky to have Elon Musk. But its complicated..
            Anyhow, reading this well written book provides insight to one of the most productive people of our time. I recommend it highly.""";

    String reviewPrompt3 = """
        Your task is to generate a summary for a book from reviews. The summary will be used for a
        web page selling the book. You will be given 3 reviews. Create the summary based on the reviews and
        include information in the summary from all 3 reviews.

        Summarize the reviews below, delimited by triple backticks, in at most 200 words.
    
        Review: ```{review}```
        
        Review 2: ```{review2}```
        
        Review 3: ```{review3}```
    """;

    @Test
    void testCreateDescriptionFrom3Reviews() {
        PromptTemplate promptTemplate = new PromptTemplate(reviewPrompt3,
                Map.of("review", review1, "review2", review2, "review3", review3));

        System.out.println(openAiChatClient.call(promptTemplate.create()).getResult().getOutput().getContent());
    }

    String reviewPrompt4 = """
        Your task is to extract a summary for a book from reviews. The summary will be used for a
        web page selling the book. You will be given 3 reviews. Create the summary based on the reviews and
        include information in the summary from all 3 reviews.

        Summarize the reviews below, delimited by triple backticks, in at most 200 words.
    
        Review: ```{review}```
        
        Review 2: ```{review2}```
        
        Review 3: ```{review3}```
    """;

    @Test
    void testCreateDescriptionFrom3ReviewsExtract() {
        PromptTemplate promptTemplate = new PromptTemplate(reviewPrompt4,
                Map.of("review", review1, "review2", review2, "review3", review3));

        System.out.println(openAiChatClient.call(promptTemplate.create()).getResult().getOutput().getContent());
    }
}
