# movie class
class Movie:
    '''reps a movie'''
    def __init__(self,title,storyline, poster_img_url,trailer_youtube_url):
        self.title = title
        self.storyline = storyline
        self.poster_img_url = poster_img_url
        self.trailer_youtube_url = trailer_youtube_url
        
        
        
        
    def __repr__(self):
        return f'''Title:{self.title}
        story:{self.storyline}
        poster:{self.poster_img_url}
        trailer:{self.trailer_youtube_url}'''
    
    
if __name__ == "__main__":
    x = Movie("Fast and furious", "fast cars", "https://images.app.goo.gl/aZPUVMZQBJspjDuH6", "https://youtu.be/Kopyc23VfSw")
    print(x)